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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceForModifyConfigRequest extends RpcAcsRequest<QueryPriceForModifyConfigResponse> {
	
	public QueryPriceForModifyConfigRequest() {
		super("Emr", "2016-04-08", "QueryPriceForModifyConfig");
	}

	private Long resourceOwnerId;

	private List<ModifyConfigSpec> modifyConfigSpecs;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<ModifyConfigSpec> getModifyConfigSpecs() {
		return this.modifyConfigSpecs;
	}

	public void setModifyConfigSpecs(List<ModifyConfigSpec> modifyConfigSpecs) {
		this.modifyConfigSpecs = modifyConfigSpecs;	
		if (modifyConfigSpecs != null) {
			for (int depth1 = 0; depth1 < modifyConfigSpecs.size(); depth1++) {
				putQueryParameter("ModifyConfigSpec." + (depth1 + 1) + ".HostGroupId" , modifyConfigSpecs.get(depth1).getHostGroupId());
				putQueryParameter("ModifyConfigSpec." + (depth1 + 1) + ".NewInstanceType" , modifyConfigSpecs.get(depth1).getNewInstanceType());
				putQueryParameter("ModifyConfigSpec." + (depth1 + 1) + ".NewDiskSize" , modifyConfigSpecs.get(depth1).getNewDiskSize());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public static class ModifyConfigSpec {

		private String hostGroupId;

		private String newInstanceType;

		private Integer newDiskSize;

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public String getNewInstanceType() {
			return this.newInstanceType;
		}

		public void setNewInstanceType(String newInstanceType) {
			this.newInstanceType = newInstanceType;
		}

		public Integer getNewDiskSize() {
			return this.newDiskSize;
		}

		public void setNewDiskSize(Integer newDiskSize) {
			this.newDiskSize = newDiskSize;
		}
	}

	@Override
	public Class<QueryPriceForModifyConfigResponse> getResponseClass() {
		return QueryPriceForModifyConfigResponse.class;
	}

}
