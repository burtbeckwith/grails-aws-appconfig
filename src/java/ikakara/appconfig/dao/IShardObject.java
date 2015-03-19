/* Copyright 2014-2015 Allen Arakaki.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ikakara.appconfig.dao;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 *
 * @author Allen
 */
public interface IShardObject {

  Integer getShardCount();

  void setShardCount(Integer count);

  String getShardMapStr();

  void setShardMapStr(String name);

  Map getShardMap();

  void setShardMap(Map sm);

  TypeReference typeReference();
}
