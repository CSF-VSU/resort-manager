import org.hibernate.dialect.MySQL5Dialect

dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = MySQL5Dialect
    url = "jdbc:mysql://localhost:3306/resort_manager"
    username = "resort_manager"
    password = "resort_manager"
    dbCreate = "update"
}
hibernate {
    show_sql = true
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

environments {
    development {

    }
    test {
        //
    }
    production {
        //
    }
}
