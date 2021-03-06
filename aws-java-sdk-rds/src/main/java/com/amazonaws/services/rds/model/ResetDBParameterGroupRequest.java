/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ResetDBParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetDBParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB parameter group to default values. By default,
     * all parameters in the DB parameter group are reset to default values.
     * </p>
     */
    private Boolean resetAllParameters;
    /**
     * <p>
     * To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     * <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a single
     * request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;

    /**
     * Default constructor for ResetDBParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ResetDBParameterGroupRequest() {
    }

    /**
     * Constructs a new ResetDBParameterGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing DBParameterGroup.
     *        </p>
     *        </li>
     */
    public ResetDBParameterGroupRequest(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing DBParameterGroup.
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the name of an existing DBParameterGroup.
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing DBParameterGroup.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing DBParameterGroup.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB parameter group to default values. By default,
     * all parameters in the DB parameter group are reset to default values.
     * </p>
     * 
     * @param resetAllParameters
     *        A value that indicates whether to reset all parameters in the DB parameter group to default values. By
     *        default, all parameters in the DB parameter group are reset to default values.
     */

    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB parameter group to default values. By default,
     * all parameters in the DB parameter group are reset to default values.
     * </p>
     * 
     * @return A value that indicates whether to reset all parameters in the DB parameter group to default values. By
     *         default, all parameters in the DB parameter group are reset to default values.
     */

    public Boolean getResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB parameter group to default values. By default,
     * all parameters in the DB parameter group are reset to default values.
     * </p>
     * 
     * @param resetAllParameters
     *        A value that indicates whether to reset all parameters in the DB parameter group to default values. By
     *        default, all parameters in the DB parameter group are reset to default values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        setResetAllParameters(resetAllParameters);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to reset all parameters in the DB parameter group to default values. By default,
     * all parameters in the DB parameter group are reset to default values.
     * </p>
     * 
     * @return A value that indicates whether to reset all parameters in the DB parameter group to default values. By
     *         default, all parameters in the DB parameter group are reset to default values.
     */

    public Boolean isResetAllParameters() {
        return this.resetAllParameters;
    }

    /**
     * <p>
     * To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     * <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a single
     * request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * 
     * @return To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     *         <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the
     *         following: <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be
     *         modified in a single request.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *         </p>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *         value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *         </p>
     *         <p>
     *         You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *         value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Valid Values (for Apply method): <code>pending-reboot</code>
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     * <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a single
     * request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * 
     * @param parameters
     *        To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     *        <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     *        <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a
     *        single request.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *        value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *        value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>pending-reboot</code>
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     * <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a single
     * request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     *        <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     *        <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a
     *        single request.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *        value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *        value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>pending-reboot</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBParameterGroupRequest withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     * <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     * <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a single
     * request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     * </p>
     * <p>
     * You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code> value
     * for both dynamic and static parameters, and changes are applied when DB instance reboots.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Valid Values (for Apply method): <code>pending-reboot</code>
     * </p>
     * 
     * @param parameters
     *        To reset the entire DB parameter group, specify the <code>DBParameterGroup</code> name and
     *        <code>ResetAllParameters</code> parameters. To reset specific parameters, provide a list of the following:
     *        <code>ParameterName</code> and <code>ApplyMethod</code>. A maximum of 20 parameters can be modified in a
     *        single request.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *        value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>immediate</code> | <code>pending-reboot</code>
     *        </p>
     *        <p>
     *        You can use the immediate value with dynamic parameters only. You can use the <code>pending-reboot</code>
     *        value for both dynamic and static parameters, and changes are applied when DB instance reboots.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Valid Values (for Apply method): <code>pending-reboot</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetDBParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getResetAllParameters() != null)
            sb.append("ResetAllParameters: ").append(getResetAllParameters()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetDBParameterGroupRequest == false)
            return false;
        ResetDBParameterGroupRequest other = (ResetDBParameterGroupRequest) obj;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getResetAllParameters() == null ^ this.getResetAllParameters() == null)
            return false;
        if (other.getResetAllParameters() != null && other.getResetAllParameters().equals(this.getResetAllParameters()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getResetAllParameters() == null) ? 0 : getResetAllParameters().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ResetDBParameterGroupRequest clone() {
        return (ResetDBParameterGroupRequest) super.clone();
    }

}
