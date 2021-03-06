/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yasith.me.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 0.1-SNAPSHOT
 */
@Path("/service")
public class DemoService {

    @GET
    @Path("/")
    public String get() {       
        System.out.println("GET invoked");
        return "MicroServiceDemo GET invoked";
    }

    @POST
    @Path("/")
    public String post(Data data) {        
        System.out.println("POST invoked");
        System.out.println(data.getName());        
        return "POST invoked successfully, data received : \r\n name : " + data.getName() + "\r\n age : " + data.getAge() + "\r\n height : " + data.getHeight();
    }

    @PUT
    @Path("/")
    public void put() {        
        System.out.println("PUT invoked");
    }

    @DELETE
    @Path("/")
    public void delete() {        
        System.out.println("DELETE invoked");
    }
}
