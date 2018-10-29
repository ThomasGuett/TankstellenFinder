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

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Generated class for hooks on your Tankstelle data model
 */

public class TankstelleHooksTransient<T extends com.apiomat.nativemodule.tankstellenfinder.Tankstelle>
	implements com.apiomat.nativemodule.IModelHooksTransient<com.apiomat.nativemodule.tankstellenfinder.Tankstelle>
{
	protected com.apiomat.nativemodule.tankstellenfinder.Tankstelle model;

	@Override
	public void setCallingModel( com.apiomat.nativemodule.tankstellenfinder.Tankstelle model )
	{
		this.model = model;
	}

	/* do-Methods can be used if your data model is set to TRANSIENT */

	@Override
	public String doPost( com.apiomat.nativemodule.tankstellenfinder.Tankstelle obj,
		com.apiomat.nativemodule.Request r )
	{
		return null;
	}

	@Override
	public com.apiomat.nativemodule.tankstellenfinder.Tankstelle doGet( String foreignId,
		com.apiomat.nativemodule.Request r )
	{
		return null;
	}

	@Override
	public java.util.List<com.apiomat.nativemodule.tankstellenfinder.Tankstelle> doGetAll( String query,
		com.apiomat.nativemodule.Request r )
	{
		List<Tankstelle> tankstellen = new ArrayList<Tankstelle>( );
		try
		{
			String apiKey = ( String ) TankstellenFinder.APP_CONFIG_PROXY
				.getConfigValue( TankstellenFinder.TANKKOENIG_API_KEY, r.getApplicationName( ), r.getSystem( ) );
			String strApiUrl =
				"https://creativecommons.tankerkoenig.de/json/list.php?lat=52.521&lng=13.438&rad=1.5&sort=dist&type=all&apikey=" +
					apiKey;
			this.model.log( strApiUrl );
			final URL apiUrl = new URL( strApiUrl );
			InputStream in = apiUrl.openStream( );
			ByteArrayOutputStream out = new ByteArrayOutputStream( );
			byte[ ] buffer = new byte[ 4096 ];
			int n;
			while ( ( n = in.read( buffer ) ) > 0 )
			{
				out.write( buffer, 0, n );
			}
			in.close( );
			out.close( );
			JSONObject jsonResponse = new JSONObject( out.toString( ) );
			JSONArray jsonStations = jsonResponse.optJSONArray( "stations" );
			for ( int i = 0; i < jsonStations.length( ); i++ )
			{
				JSONObject jsonStation = jsonStations.getJSONObject( i );
				Tankstelle tankstelle = new Tankstelle( );
				tankstelle.setName( jsonStation.optString( "name" ) );
				tankstelle.setE5( jsonStation.optDouble( "e5" ) );
				tankstelle.setE10( jsonStation.optDouble( "e10" ) );
				tankstelle.setDiesel( jsonStation.optDouble( "diesel" ) );
				tankstelle.setLocationLatitude( jsonStation.optDouble( "lat" ) );
				tankstelle.setLocationLongitude( jsonStation.optDouble( "lng" ) );
				tankstellen.add( tankstelle );
			}
			/* Erzeugung als non-transient */
			//    	Tankstelle tankstelle = (Tankstelle) TankstellenFinder.AOM.createObject( r.getApplicationName( ), Tankstelle.MODULE_NAME, Tankstelle.MODEL_NAME, r );
		}
		catch ( Exception e )
		{
			this.model.throwException( e.getMessage( ) );
			//			TankstellenFinder.AOM.throwException( r.getApplicationName( ), e.getMessage( ) );
		}
		return tankstellen;
	}

	@Override
	public long doCountAll( String query, com.apiomat.nativemodule.Request r )
	{
		return 0;
	}

	@Override
	public void doPut( com.apiomat.nativemodule.tankstellenfinder.Tankstelle obj, com.apiomat.nativemodule.Request r )
	{}

	@Override
	public boolean doDelete( String foreignId, com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public boolean doDeleteAll( String query, com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	@Override
	public String doPostData( final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper,
		final com.apiomat.nativemodule.Request r )
	{
		return null;
	}

	@Override
	public com.apiomat.nativemodule.DataWrapper doGetData( final String dataId, final String attributeName,
		final com.apiomat.nativemodule.TranscodingConfiguration transcodingConfig,
		final com.apiomat.nativemodule.Request r )
	{
		return null;
	}

	@Override
	public boolean doDeleteData( final String attributeName, final String dataId,
		final com.apiomat.nativemodule.Request r )
	{
		return false;
	}

	/* Please note: Before doPostRef gets called, doGet gets called internally,
	 * so that this.model can be populated with attribute values. */
	@Override
	public void doPostRef( Object referencedObject, String referenceName, com.apiomat.nativemodule.Request r )
	{}

	/* Please note: Before doGetRef gets called, doGet gets called internally,
	 * so that this.model can be populated with attribute values. */
	@Override
	public <Z extends com.apiomat.nativemodule.AbstractClientDataModel> java.util.List<Z> doGetRef( String refName,
		String query, com.apiomat.nativemodule.Request r )
	{
		return null;
	}

	/* Please note: Before doDeleteRef gets called, doGet gets called internally,
	 * so that this.model can be populated with attribute values. */
	@Override
	public void doDeleteRef( String refName, String refForeignId, com.apiomat.nativemodule.Request r )
	{}

}
