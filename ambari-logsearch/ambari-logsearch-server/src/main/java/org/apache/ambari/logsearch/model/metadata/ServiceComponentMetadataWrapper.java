/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ambari.logsearch.model.metadata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import java.util.List;
import java.util.Map;

@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceComponentMetadataWrapper {
  private final Map<String, String> groups;
  private final List<ComponentMetadata> metadata;

  public ServiceComponentMetadataWrapper(List<ComponentMetadata> metadata, Map<String, String> groups) {
    this.groups = groups;
    this.metadata = metadata;
  }

  public Map<String, String> getGroups() {
    return groups;
  }

  public List<ComponentMetadata> getMetadata() {
    return metadata;
  }
}
