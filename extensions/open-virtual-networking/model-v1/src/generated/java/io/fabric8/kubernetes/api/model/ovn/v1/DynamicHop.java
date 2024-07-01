
package io.fabric8.kubernetes.api.model.ovn.v1;

import java.util.LinkedHashMap;
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
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bfdEnabled",
    "namespaceSelector",
    "networkAttachmentName",
    "podSelector"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("jsonschema2pojo")
public class DynamicHop implements Editable<DynamicHopBuilder> , KubernetesResource
{

    @JsonProperty("bfdEnabled")
    private Boolean bfdEnabled;
    @JsonProperty("namespaceSelector")
    private io.fabric8.kubernetes.api.model.LabelSelector namespaceSelector;
    @JsonProperty("networkAttachmentName")
    private String networkAttachmentName;
    @JsonProperty("podSelector")
    private io.fabric8.kubernetes.api.model.LabelSelector podSelector;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DynamicHop() {
    }

    public DynamicHop(Boolean bfdEnabled, io.fabric8.kubernetes.api.model.LabelSelector namespaceSelector, String networkAttachmentName, io.fabric8.kubernetes.api.model.LabelSelector podSelector) {
        super();
        this.bfdEnabled = bfdEnabled;
        this.namespaceSelector = namespaceSelector;
        this.networkAttachmentName = networkAttachmentName;
        this.podSelector = podSelector;
    }

    @JsonProperty("bfdEnabled")
    public Boolean getBfdEnabled() {
        return bfdEnabled;
    }

    @JsonProperty("bfdEnabled")
    public void setBfdEnabled(Boolean bfdEnabled) {
        this.bfdEnabled = bfdEnabled;
    }

    @JsonProperty("namespaceSelector")
    public io.fabric8.kubernetes.api.model.LabelSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    @JsonProperty("namespaceSelector")
    public void setNamespaceSelector(io.fabric8.kubernetes.api.model.LabelSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @JsonProperty("networkAttachmentName")
    public String getNetworkAttachmentName() {
        return networkAttachmentName;
    }

    @JsonProperty("networkAttachmentName")
    public void setNetworkAttachmentName(String networkAttachmentName) {
        this.networkAttachmentName = networkAttachmentName;
    }

    @JsonProperty("podSelector")
    public io.fabric8.kubernetes.api.model.LabelSelector getPodSelector() {
        return podSelector;
    }

    @JsonProperty("podSelector")
    public void setPodSelector(io.fabric8.kubernetes.api.model.LabelSelector podSelector) {
        this.podSelector = podSelector;
    }

    @JsonIgnore
    public DynamicHopBuilder edit() {
        return new DynamicHopBuilder(this);
    }

    @JsonIgnore
    public DynamicHopBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
