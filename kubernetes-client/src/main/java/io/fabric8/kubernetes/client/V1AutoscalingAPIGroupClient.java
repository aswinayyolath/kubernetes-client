/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.model.autoscaling.v1.DoneableHorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.autoscaling.v1.HorizontalPodAutoscalerList;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.dsl.internal.autoscaling.v1.HorizontalPodAutoscalerOperationsImpl;
import okhttp3.OkHttpClient;

public class V1AutoscalingAPIGroupClient extends BaseClient implements V1AutoscalingAPIGroupDSL {

  public V1AutoscalingAPIGroupClient() {
    super();
  }

  public V1AutoscalingAPIGroupClient(OkHttpClient httpClient, final Config config) {
    super(httpClient, config);
  }

  public MixedOperation<HorizontalPodAutoscaler, HorizontalPodAutoscalerList, DoneableHorizontalPodAutoscaler, Resource<HorizontalPodAutoscaler, DoneableHorizontalPodAutoscaler>> horizontalPodAutoscalers() {
    return new HorizontalPodAutoscalerOperationsImpl(httpClient, getConfiguration());
  }
}
