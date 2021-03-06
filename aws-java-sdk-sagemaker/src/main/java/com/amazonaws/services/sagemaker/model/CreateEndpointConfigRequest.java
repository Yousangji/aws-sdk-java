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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateEndpointConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> request.
     * </p>
     */
    private String endpointConfigName;
    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     */
    private java.util.List<ProductionVariant> productionVariants;
    /**
     * <p>
     * A list of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance that hosts the endpoint.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> request.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration. You specify this name in a <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> request.
     */

    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> request.
     * </p>
     * 
     * @return The name of the endpoint configuration. You specify this name in a <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a>
     *         request.
     */

    public String getEndpointConfigName() {
        return this.endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration. You specify this name in a <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> request.
     * </p>
     * 
     * @param endpointConfigName
     *        The name of the endpoint configuration. You specify this name in a <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html">CreateEndpoint</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigRequest withEndpointConfigName(String endpointConfigName) {
        setEndpointConfigName(endpointConfigName);
        return this;
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * 
     * @return An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *         endpoint.
     */

    public java.util.List<ProductionVariant> getProductionVariants() {
        return productionVariants;
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * 
     * @param productionVariants
     *        An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *        endpoint.
     */

    public void setProductionVariants(java.util.Collection<ProductionVariant> productionVariants) {
        if (productionVariants == null) {
            this.productionVariants = null;
            return;
        }

        this.productionVariants = new java.util.ArrayList<ProductionVariant>(productionVariants);
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductionVariants(java.util.Collection)} or {@link #withProductionVariants(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param productionVariants
     *        An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigRequest withProductionVariants(ProductionVariant... productionVariants) {
        if (this.productionVariants == null) {
            setProductionVariants(new java.util.ArrayList<ProductionVariant>(productionVariants.length));
        }
        for (ProductionVariant ele : productionVariants) {
            this.productionVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this endpoint.
     * </p>
     * 
     * @param productionVariants
     *        An list of <code>ProductionVariant</code> objects, one for each model that you want to host at this
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigRequest withProductionVariants(java.util.Collection<ProductionVariant> productionVariants) {
        setProductionVariants(productionVariants);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs. For more information, see <a
     *        href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i> AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance that hosts the endpoint.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt
     *        data on the storage volume attached to the ML compute instance that hosts the endpoint.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance that hosts the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt
     *         data on the storage volume attached to the ML compute instance that hosts the endpoint.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on
     * the storage volume attached to the ML compute instance that hosts the endpoint.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt
     *        data on the storage volume attached to the ML compute instance that hosts the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointConfigRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: ").append(getEndpointConfigName()).append(",");
        if (getProductionVariants() != null)
            sb.append("ProductionVariants: ").append(getProductionVariants()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointConfigRequest == false)
            return false;
        CreateEndpointConfigRequest other = (CreateEndpointConfigRequest) obj;
        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        if (other.getProductionVariants() == null ^ this.getProductionVariants() == null)
            return false;
        if (other.getProductionVariants() != null && other.getProductionVariants().equals(this.getProductionVariants()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        hashCode = prime * hashCode + ((getProductionVariants() == null) ? 0 : getProductionVariants().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointConfigRequest clone() {
        return (CreateEndpointConfigRequest) super.clone();
    }

}
