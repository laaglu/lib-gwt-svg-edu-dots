package org.vectomatic.svg.edu.client.dots;

import org.vectomatic.svg.edu.client.commons.CommonBundle;
import org.vectomatic.svg.edu.client.commons.MediaQueriesCss;

import com.google.gwt.core.client.GWT;

public interface DotsBundle extends CommonBundle {
	public static DotsBundle INSTANCE = GWT.create(DotsBundle.class);
	@Source("mediaQueriesLandscape.css")
	public MediaQueriesCss mediaQueriesLandscape();
	@Source("mediaQueriesPortrait.css")
	public MediaQueriesCss mediaQueriesPortrait();

}
