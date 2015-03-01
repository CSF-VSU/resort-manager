package resort_manager.auth

import grails.transaction.Transactional
import redis.clients.jedis.Jedis

@Transactional
class RecoveryService {

    def redisService
    def secretService

    /**
     *
     * @param email
     * @return
     */
    def create(email) {
        def secret = secretService.secret(email)
        def expires = new Date() + 1
        redisService.withRedis { Jedis redis ->
            redis.hset(key(email), 'secret', secret)
            redis.hset(key(email), 'expires', expires.getTime().toString())
        }
        return secret
    }

    /**
     *
     * @param secret
     */
    def check(secret) {
        def current = new Date()
        redisService.withRedis { Jedis redis ->
            def secretMatch = redis.hget(key(email), 'secret') == secret
            def expiresMatch = current.getTime() < Long.parseLong(redis.hget(key(email), 'expires'))
            return secretMatch && expiresMatch
        }
    }

    private static def key(email) {
        return "recovery:${email}"
    }

}
