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
package org.n52.sps.service.admin;

import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.n52.ows.exception.OwsException;
import org.n52.ows.exception.OwsExceptionReport;
import org.n52.sps.service.CapabilitiesInterceptor;
import org.n52.sps.service.InternalServiceException;
import org.n52.sps.service.SpsOperationExtension;
import org.x52North.schemas.sps.v2.InsertSensorOfferingDocument;

public interface SpsAdmin extends CapabilitiesInterceptor, SpsOperationExtension {
    
    final static String INSERT_SENSOR_OFFERING = "InsertSensorOffering";
    
    final static String INSERT_RESOURCE = "insert";
    
    final static String DELETE_SENSOR_OFFERING = "DeleteSensorOffering";
    
    final static String DELETE_RESOURCE = "delete";
    
    public void setInsertSensorOfferingListeners(List<InsertSensorOfferingListener> insertSensorOfferingListeners);
    
    public void setDeleteSensorOfferingListeners(List<DeleteSensorOfferingListener> deleteSensorOfferingListeners);
    
    public void insertSensorOffering(InsertSensorOfferingDocument offering, OwsExceptionReport exceptionReport) throws OwsException, InternalServiceException;

    // TODO pass procedure and identifier instead of xmlobject
    public void deleteSensorOffering(XmlObject request, OwsExceptionReport exceptionReport) throws InternalServiceException;

}
