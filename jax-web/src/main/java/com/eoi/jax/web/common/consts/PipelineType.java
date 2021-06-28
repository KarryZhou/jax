/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eoi.jax.web.common.consts;

public enum PipelineType {
    STREAMING("streaming"),
    FLINK_SQL("flink_sql"),
    FLINK_CMD("flink_cmd"),
    BATCH("batch");

    public final String code;

    PipelineType(String code) {
        this.code = code;
    }

    public boolean isEqual(String code) {
        return this.code.equals(code);
    }

    public static boolean isBatch(String code) {
        return BATCH.isEqual(code);
    }

    public static boolean isStreaming(String code) {
        return STREAMING.isEqual(code) || FLINK_SQL.isEqual(code) || FLINK_CMD.isEqual(code);
    }
}
