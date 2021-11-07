/*
*  Copyright 2019-2020 Zheng Jie
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
package org.linkworld.ocean.system.service.dto;

import lombok.Data;
import java.sql.Timestamp;
import java.io.Serializable;

/**
* @author HALOXIAO
* @date 2021-11-06
**/
@Data
public class OceanSensorDto implements Serializable {

    private Long id;

    private String name;

    private Integer userId;

    /** 用户的配置 */
    private String config;

    /** 传感器的位置（用户设定）,如果是GPS类型的话，直接置空 */
    private String position;

    /** 注释 */
    private String note;

    private Timestamp createTime;
}