/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */
package org.opensearch.plugin.morfologik;

import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.opensearch.client.Request;
import org.opensearch.client.Response;
import org.opensearch.test.rest.OpenSearchRestTestCase;

public class MorfologikPluginIT extends OpenSearchRestTestCase {

    public void testPluginLoaded() throws Exception {
        Response response = client().performRequest(new Request("GET", "/_cat/plugins"));
        String body = EntityUtils.toString(response.getEntity());

        assertTrue("Plugin morfologik nie został załadowany",
                   body.contains("opensearch-analysis-morfologik"));
    }
}
