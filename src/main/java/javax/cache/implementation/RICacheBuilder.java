/**
 *  Copyright 2011 Terracotta, Inc.
 *  Copyright 2011 Oracle America Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package javax.cache.implementation;

import javax.cache.Cache;
import javax.cache.CacheBuilder;
import javax.cache.CacheConfiguration;

/**
 * The reference implementation for JSR107.
 * <p/>
 * {@inheritDoc}
 *
 * @author Yannis Cosmadopoulos
 * @since 1.0
 */
public enum RICacheBuilder implements CacheBuilder {
    /**
     * the singleton instance
     */
    instance;

    /**
     * {@inheritDoc}
     */
    public <K, V> Cache<K, V> createCache(String cacheName) {
        return new RICache.Builder<K, V>().setCacheName(cacheName).build();
    }

    /**
     * {@inheritDoc}
     */
    public <K, V> Cache<K, V> createCache(String cacheName, CacheConfiguration configuration) {
        return new RICache.Builder<K, V>().setCacheName(cacheName).setCacheConfiguration(configuration).build();
    }
}
