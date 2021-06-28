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

public enum YarnState {
    NEW("NEW"),

    /** Application which is being saved. */
    NEW_SAVING("NEW_SAVING"),

    /** Application which has been submitted. */
    SUBMITTED("SUBMITTED"),

    /** Application has been accepted by the scheduler */
    ACCEPTED("ACCEPTED"),

    /** Application which is currently running. */
    RUNNING("RUNNING"),

    /** Application which finished successfully. */
    FINISHED("FINISHED"),

    /** Application which failed. */
    FAILED("FAILED"),

    /** Application which was terminated by a user or admin. */
    KILLED("KILLED"),

    SUCCEEDED("SUCCEEDED");

    public final String code;

    YarnState(String code) {
        this.code = code;
    }

    public boolean isEqual(String code) {
        return this.code.equals(code);
    }

    public static boolean isExit(String code) {
        return YarnState.FINISHED.code.equals(code)
                || YarnState.KILLED.code.equals(code)
                || YarnState.FAILED.code.equals(code);
    }
}
