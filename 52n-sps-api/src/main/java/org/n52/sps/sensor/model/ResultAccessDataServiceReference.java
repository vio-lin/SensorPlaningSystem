/**
 * Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */
package org.n52.sps.sensor.model;

import java.util.List;

public class ResultAccessDataServiceReference {
    
    private Long id; // database id
    
    private String reference;
    
    private String role;
    
    private String title;
    
    private String identifier;
    
    private String referenceAbstract;
    
    private String format;

    /**
     * Content of SPSMetadata types
     */
    private List<String> dataAccessTypes;

    public ResultAccessDataServiceReference() {
        // database serialization
    }
    
    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getReferenceAbstract() {
        return referenceAbstract;
    }

    public void setReferenceAbstract(String referenceAbstract) {
        this.referenceAbstract = referenceAbstract;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<String> getDataAccessTypes() {
        return dataAccessTypes;
    }

    public void setDataAccessTypes(List<String> dataAccessTypes) {
        this.dataAccessTypes = dataAccessTypes;
    }
    
    
}
