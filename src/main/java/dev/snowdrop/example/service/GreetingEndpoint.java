/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
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
package dev.snowdrop.example.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Path("/greeting")
@Component
public class GreetingEndpoint {

    @Value("${greeter.message}")
    private String greeterMessageFormat; 

    @GET
    @Produces("application/json")
    public Greeting greeting(@QueryParam("name") @DefaultValue("World") String name) {
        String prefix = System.getenv().getOrDefault("GREETING_PREFIX", "Good Morning, ");
        
        if(greeterMessageFormat == null) {
            greeterMessageFormat = "%s %s";
        }

        final String message = String.format(greeterMessageFormat, prefix, name);
        return new Greeting(message);
    }
}
