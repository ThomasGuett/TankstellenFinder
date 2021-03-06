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
import com.apiomat.nativemodule.tankstellenfinder.*;
/**
* Generated default class representing a user in your app
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "TankstellenFinder",
    hooksClassNameTransient = "com.apiomat.nativemodule.tankstellenfinder.TankUserHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.tankstellenfinder.TankUserHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.Guest, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class TankUser extends com.apiomat.nativemodule.basics.User
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "TankstellenFinder";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "TankUser";

    /** class specific attributes */
    private java.util.List<com.apiomat.nativemodule.tankstellenfinder.Praeferenz> praeferenzen = new java.util.ArrayList<com.apiomat.nativemodule.tankstellenfinder.Praeferenz>();
    private Double radius = null;
    private String sorte = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public TankUser ()
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

    public java.util.List<com.apiomat.nativemodule.tankstellenfinder.Praeferenz> getPraeferenzen() 
    {
        if(this.praeferenzen == null || this.praeferenzen.size() == 0)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReferences", String.class,  Class.class );
                this.praeferenzen =  ( java.util.List<com.apiomat.nativemodule.tankstellenfinder.Praeferenz> ) m.invoke( this, "praeferenzen", com.apiomat.nativemodule.tankstellenfinder.Praeferenz.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                //silently ignored
            }
        }   
        return this.praeferenzen;
    }

    public void postPraeferenzen( final com.apiomat.nativemodule.tankstellenfinder.Praeferenz refData )
    {
        addReference( "praeferenzen", refData );
        this.praeferenzen.add( refData );
    }

    public void removePraeferenzen( final com.apiomat.nativemodule.tankstellenfinder.Praeferenz refData )
    {
        removeReference( "praeferenzen", refData );
        this.praeferenzen.remove( refData );
    }

    public Double getRadius()
    {
         return this.radius;
    }

    public void setRadius( Double arg )
    {
        this.radius = arg;
    }

    public String getSorte()
    {
         return this.sorte;
    }

    public void setSorte( String arg )
    {
        this.sorte = arg;
    }

}
