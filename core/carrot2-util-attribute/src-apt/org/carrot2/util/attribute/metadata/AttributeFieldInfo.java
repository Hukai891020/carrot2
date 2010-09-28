package org.carrot2.util.attribute.metadata;

import javax.lang.model.element.VariableElement;

import org.carrot2.util.attribute.AttributeLevel;

/**
 * Additional information about an attribute field.
 */
public class AttributeFieldInfo
{
    private final String key;
    private final AttributeMetadata metadata;
    private final String javaDoc;
    private final VariableElement field;
    private final String declaringClass;
    private final String descriptorClass;
    private final AttributeFieldInfo inherited;

    AttributeFieldInfo(String attributeKey, AttributeMetadata metadata,
        String javaDoc, VariableElement field, String declaringClass, String descriptorClass,
        AttributeFieldInfo inherited)
    {
        this.key = attributeKey;
        this.metadata = metadata;
        this.javaDoc = javaDoc;
        this.field = field;
        this.declaringClass = declaringClass;
        this.descriptorClass = descriptorClass;
        this.inherited = inherited;
    }

    /**
     * Returns the key of this attribute.
     */
    public String getKey()
    {
        return key;
    }
    
    public String getJavaDoc()
    {
        return javaDoc;
    }

    public VariableElement getField()
    {
        return field;
    }

    public String getDeclaringClass()
    {
        return declaringClass;
    }

    public String getDescriptorClass()
    {
        return descriptorClass;
    }

    public String getLabel()
    {
        return metadata.label;
    }
    
    public String getDescription()
    {
        return metadata.description;
    }
    
    public String getTitle()
    {
        return metadata.title;
    }

    public String getGroup()
    {
        return metadata.getGroup();
    }

    public AttributeLevel getLevel()
    {
        return metadata.getLevel();
    }
    
    public AttributeFieldInfo getInherited()
    {
        return inherited;
    }
}
