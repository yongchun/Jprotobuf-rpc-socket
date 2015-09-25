/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.jprotobuf.pbrpc.registry;

import java.util.Map;

/**
 * POJO class of reigster info.
 *
 * @author xiemalin
 * @since 2.27
 */
public class RegisterInfo {

    /**
     * host info
     */
    private String host;

    private int port;

    /**
     * the unique mark for each service info
     */
    private String service;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((host == null) ? 0 : host.hashCode());
        result = prime * result + port;
        result = prime * result + ((protocol == null) ? 0 : protocol.hashCode());
        result = prime * result + ((service == null) ? 0 : service.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(!(obj instanceof RegisterInfo)){
            return false;
        }
        //
        RegisterInfo other = (RegisterInfo) obj;

        boolean isHostEqual = isEqual(host, other.host);
        if (!isHostEqual) {
            return isHostEqual;
        }

        if (port != other.port) {
            return false;
        }

        boolean isProtocolEqual = isEqual(protocol, other.protocol);
        if (!isProtocolEqual) {
            return isProtocolEqual;
        }

        boolean isServiceEqual = isEqual(service, other.service);
        if (!isServiceEqual) {
            return isHostEqual;
        }

        return true;
    }

    /**
     * protocol info
     */
    private String protocol;

    private Map<String, String> extraInfos;

    /**
     * get the host
     *
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * set host value to host
     *
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get the service
     *
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * set service value to service
     *
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * get the protocol
     *
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set protocol value to protocol
     *
     * @param protocol the protocol to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * get the extraInfos
     *
     * @return the extraInfos
     */
    public Map<String, String> getExtraInfos() {
        return extraInfos;
    }

    /**
     * set extraInfos value to extraInfos
     *
     * @param extraInfos the extraInfos to set
     */
    public void setExtraInfos(Map<String, String> extraInfos) {
        this.extraInfos = extraInfos;
    }

    /**
     * get the port
     *
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * set port value to port
     *
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * 比较两个字符串是否相等
     * 测试类 @see com.baidu.jprotobuf.pbrpc.CommonTest.testIsEqual
     */
    public boolean isEqual(String source, String target) {
        if ((source == null) && (target == null)) {
            return Boolean.TRUE;
        }

        if ((source != null) && (source.equals(target))) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}
