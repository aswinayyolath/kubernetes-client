
package io.fabric8.kubernetes.api.model.kustomize.v1beta1;

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
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.sundr.builder.annotations.Buildable;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "additionalValuesFiles",
    "apiVersions",
    "includeCRDs",
    "name",
    "nameTemplate",
    "namespace",
    "releaseName",
    "repo",
    "skipHooks",
    "skipTests",
    "valuesFile",
    "valuesInline",
    "valuesMerge",
    "version"
})
@ToString
@EqualsAndHashCode
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder")
@Generated("jsonschema2pojo")
public class HelmChart implements Editable<HelmChartBuilder> , KubernetesResource
{

    @JsonProperty("additionalValuesFiles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> additionalValuesFiles = new ArrayList<String>();
    @JsonProperty("apiVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> apiVersions = new ArrayList<String>();
    @JsonProperty("includeCRDs")
    private Boolean includeCRDs;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nameTemplate")
    private String nameTemplate;
    @JsonProperty("namespace")
    private String namespace;
    @JsonProperty("releaseName")
    private String releaseName;
    @JsonProperty("repo")
    private String repo;
    @JsonProperty("skipHooks")
    private Boolean skipHooks;
    @JsonProperty("skipTests")
    private Boolean skipTests;
    @JsonProperty("valuesFile")
    private String valuesFile;
    @JsonProperty("valuesInline")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Map<String, Object> valuesInline = new LinkedHashMap<String, Object>();
    @JsonProperty("valuesMerge")
    private String valuesMerge;
    @JsonProperty("version")
    private String version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public HelmChart() {
    }

    public HelmChart(List<String> additionalValuesFiles, List<String> apiVersions, Boolean includeCRDs, String name, String nameTemplate, String namespace, String releaseName, String repo, Boolean skipHooks, Boolean skipTests, String valuesFile, Map<String, Object> valuesInline, String valuesMerge, String version) {
        super();
        this.additionalValuesFiles = additionalValuesFiles;
        this.apiVersions = apiVersions;
        this.includeCRDs = includeCRDs;
        this.name = name;
        this.nameTemplate = nameTemplate;
        this.namespace = namespace;
        this.releaseName = releaseName;
        this.repo = repo;
        this.skipHooks = skipHooks;
        this.skipTests = skipTests;
        this.valuesFile = valuesFile;
        this.valuesInline = valuesInline;
        this.valuesMerge = valuesMerge;
        this.version = version;
    }

    @JsonProperty("additionalValuesFiles")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getAdditionalValuesFiles() {
        return additionalValuesFiles;
    }

    @JsonProperty("additionalValuesFiles")
    public void setAdditionalValuesFiles(List<String> additionalValuesFiles) {
        this.additionalValuesFiles = additionalValuesFiles;
    }

    @JsonProperty("apiVersions")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public List<String> getApiVersions() {
        return apiVersions;
    }

    @JsonProperty("apiVersions")
    public void setApiVersions(List<String> apiVersions) {
        this.apiVersions = apiVersions;
    }

    @JsonProperty("includeCRDs")
    public Boolean getIncludeCRDs() {
        return includeCRDs;
    }

    @JsonProperty("includeCRDs")
    public void setIncludeCRDs(Boolean includeCRDs) {
        this.includeCRDs = includeCRDs;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nameTemplate")
    public String getNameTemplate() {
        return nameTemplate;
    }

    @JsonProperty("nameTemplate")
    public void setNameTemplate(String nameTemplate) {
        this.nameTemplate = nameTemplate;
    }

    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @JsonProperty("releaseName")
    public String getReleaseName() {
        return releaseName;
    }

    @JsonProperty("releaseName")
    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    @JsonProperty("repo")
    public String getRepo() {
        return repo;
    }

    @JsonProperty("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonProperty("skipHooks")
    public Boolean getSkipHooks() {
        return skipHooks;
    }

    @JsonProperty("skipHooks")
    public void setSkipHooks(Boolean skipHooks) {
        this.skipHooks = skipHooks;
    }

    @JsonProperty("skipTests")
    public Boolean getSkipTests() {
        return skipTests;
    }

    @JsonProperty("skipTests")
    public void setSkipTests(Boolean skipTests) {
        this.skipTests = skipTests;
    }

    @JsonProperty("valuesFile")
    public String getValuesFile() {
        return valuesFile;
    }

    @JsonProperty("valuesFile")
    public void setValuesFile(String valuesFile) {
        this.valuesFile = valuesFile;
    }

    @JsonProperty("valuesInline")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, Object> getValuesInline() {
        return valuesInline;
    }

    @JsonProperty("valuesInline")
    public void setValuesInline(Map<String, Object> valuesInline) {
        this.valuesInline = valuesInline;
    }

    @JsonProperty("valuesMerge")
    public String getValuesMerge() {
        return valuesMerge;
    }

    @JsonProperty("valuesMerge")
    public void setValuesMerge(String valuesMerge) {
        this.valuesMerge = valuesMerge;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonIgnore
    public HelmChartBuilder edit() {
        return new HelmChartBuilder(this);
    }

    @JsonIgnore
    public HelmChartBuilder toBuilder() {
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

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

}
