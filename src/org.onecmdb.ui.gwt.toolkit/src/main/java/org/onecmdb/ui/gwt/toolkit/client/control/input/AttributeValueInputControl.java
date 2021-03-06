/*
 * OneCMDB, an open source configuration management project.
 * Copyright 2007, Lokomo Systems AB, and individual contributors
 * as indicated by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.onecmdb.ui.gwt.toolkit.client.control.input;

import java.util.ArrayList;
import java.util.List;

import org.onecmdb.ui.gwt.toolkit.client.view.input.AttributeRender;

import com.google.gwt.user.client.rpc.AsyncCallback;

public class AttributeValueInputControl implements IAttributeValueControl {

	private AttributeRender render;
	private List attributes = new ArrayList();
	
	public AttributeRender getAttributeRender() {
		if (this.render == null) {
			this.render = new AttributeRender();
		}
		return(this.render);
	}

	public void getAttributes(AsyncCallback callback) {
		callback.onSuccess(attributes);
	}
	
	public void addAttributeValue(AbstractAttributeValue aValue) {
		attributes.add(aValue);
	}

}
