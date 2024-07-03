
package io.fabric8.openshift.api.model.storageversionmigrator.v1alpha1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentStorageVersionHash",
    "lastHeartbeatTime",
    "persistedStorageVersionHashes"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class StorageStateStatus implements Editable<StorageStateStatusBuilder> , KubernetesResource
{

    @JsonProperty("currentStorageVersionHash")
    private java.lang.String currentStorageVersionHash;
    @JsonProperty("lastHeartbeatTime")
    private String lastHeartbeatTime;
    @JsonProperty("persistedStorageVersionHashes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<java.lang.String> persistedStorageVersionHashes = new ArrayList<java.lang.String>();
    @JsonIgnore
    private Map<java.lang.String, Object> additionalProperties = new LinkedHashMap<java.lang.String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StorageStateStatus() {
    }

    public StorageStateStatus(java.lang.String currentStorageVersionHash, String lastHeartbeatTime, List<java.lang.String> persistedStorageVersionHashes) {
        super();
        this.currentStorageVersionHash = currentStorageVersionHash;
        this.lastHeartbeatTime = lastHeartbeatTime;
        this.persistedStorageVersionHashes = persistedStorageVersionHashes;
    }

    @JsonProperty("currentStorageVersionHash")
    public java.lang.String getCurrentStorageVersionHash() {
        return currentStorageVersionHash;
    }

    @JsonProperty("currentStorageVersionHash")
    public void setCurrentStorageVersionHash(java.lang.String currentStorageVersionHash) {
        this.currentStorageVersionHash = currentStorageVersionHash;
    }

    @JsonProperty("lastHeartbeatTime")
    public String getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    @JsonProperty("lastHeartbeatTime")
    public void setLastHeartbeatTime(String lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
    }

    @JsonProperty("persistedStorageVersionHashes")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<java.lang.String> getPersistedStorageVersionHashes() {
        return persistedStorageVersionHashes;
    }

    @JsonProperty("persistedStorageVersionHashes")
    public void setPersistedStorageVersionHashes(List<java.lang.String> persistedStorageVersionHashes) {
        this.persistedStorageVersionHashes = persistedStorageVersionHashes;
    }

    @JsonIgnore
    public StorageStateStatusBuilder edit() {
        return new StorageStateStatusBuilder(this);
    }

    @JsonIgnore
    public StorageStateStatusBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<java.lang.String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
