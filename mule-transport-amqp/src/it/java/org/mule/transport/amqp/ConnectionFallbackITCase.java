/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.amqp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.amqp.internal.connector.AmqpConnector;

public class ConnectionFallbackITCase extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "connection-fallback-config.xml";
    }

    @Test
    public void testFallbackSuccessfull() throws Exception
    {
        final AmqpConnector connector = (AmqpConnector) muleContext.getRegistry().lookupConnector(
            "amqpConnectorWithFallback");

        assertTrue(connector.isConnected());
    }
}
