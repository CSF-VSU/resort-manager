package resort_manager.auth

import grails.transaction.Transactional
import redis.clients.jedis.Jedis

@Transactional
class SessionService {

    def redisService
    def secretService

    /**
     * Generate and save session secret
     * (redis key - "session:email" -> secret, type - hset)
     * @param email user's email
     * @return session secret
     */
    def register(String email) {
        def value = secretService.secret(email)
        redisService.withRedis { Jedis redis ->
            redis.hset(key(email), 'email', email)
            redis.hset(key(email), 'secret', value)
        }
        return value
    }

    /**
     *
     * @param email user's email
     * @param secret current session secret
     * @return true or false
     */
    def check(email, secret) {
        redisService.withRedis { Jedis redis ->
            def emailValue = redis.hget(key(email), 'email')
            def secretValue = redis.hget(key(email), 'secret')
            return ((emailValue != null) && (emailValue == email)) && ((secretValue == secret) && (secretValue != null))
        }
    }

    /**
     * Delete current session
     * @param email user's email
     * @return void
     */
    def delete(email) {
        redisService.withRedis { Jedis redis ->
            redis.del(key(email))
        }
    }

    private static def key(email) {
        return "session:${email}"
    }

}
