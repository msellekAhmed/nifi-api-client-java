/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SearchResultsDTO;

/**
 * SearchResultsEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class SearchResultsEntity {
  @SerializedName("searchResultsDTO")
  private SearchResultsDTO searchResultsDTO = null;

  public SearchResultsEntity searchResultsDTO(SearchResultsDTO searchResultsDTO) {
    this.searchResultsDTO = searchResultsDTO;
    return this;
  }

   /**
   * Get searchResultsDTO
   * @return searchResultsDTO
  **/
  @ApiModelProperty(example = "null", value = "")
  public SearchResultsDTO getSearchResultsDTO() {
    return searchResultsDTO;
  }

  public void setSearchResultsDTO(SearchResultsDTO searchResultsDTO) {
    this.searchResultsDTO = searchResultsDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultsEntity searchResultsEntity = (SearchResultsEntity) o;
    return Objects.equals(this.searchResultsDTO, searchResultsEntity.searchResultsDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchResultsDTO);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsEntity {\n");
    
    sb.append("    searchResultsDTO: ").append(toIndentedString(searchResultsDTO)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
