/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.tankstellenfinder;


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your Praeferenz data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "TankstellenFinder",
    hooksClassNameTransient = "com.apiomat.nativemodule.tankstellenfinder.PraeferenzHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.tankstellenfinder.PraeferenzHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Praeferenz extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.tankstellenfinder.Praeferenz> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.tankstellenfinder.Praeferenz>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "TankstellenFinder";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Praeferenz";

    /** class specific attributes */
    private double[] location;
    private Double radius = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Praeferenz ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public double getLocationLatitude( )
    {
         return this.location !=null && this.location.length > 0 ? this.location[0] : 0;
    }

    public double getLocationLongitude( )
    {
         return this.location !=null && this.location.length > 1 ? this.location[1] : 0;
    }

    public void setLocationLatitude( double latitude )
    {
        if( this.location == null )
        {
            this.location = new double[]{};
        }

        if ( this.location.length < 2 )
        {
            this.location = new double[]{ latitude, 0 };
        }
        else
        {
            this.location[0] = latitude;
        }
    }

    public void setLocationLongitude( double longitude )
    {
        if( this.location == null )
        {
            this.location = new double[]{};
        }

        if ( this.location.length < 2 )
        {
            this.location = new double[]{ 0, longitude };
        }
        else
        {
            this.location[1] = longitude;
        }
    }

    public Double getRadius()
    {
         return this.radius;
    }

    public void setRadius( Double arg )
    {
        this.radius = arg;
    }

}
