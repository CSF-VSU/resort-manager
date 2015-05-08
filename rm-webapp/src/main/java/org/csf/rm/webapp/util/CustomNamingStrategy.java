package org.csf.rm.webapp.util;

import org.hibernate.cfg.ImprovedNamingStrategy;

/**
 * Created by andreypopikov on 03/05/15.
 */
public class CustomNamingStrategy extends ImprovedNamingStrategy {

    @Override
    public String tableName(String tableName) {
        return tableName.toUpperCase();
    }

}
