package com.vaadin.prototype.wc.gwt.client.components;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.core.client.js.JsArray;
import com.google.gwt.core.client.js.JsObject;
import com.google.gwt.dom.client.BodyElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.user.client.EventListener;

@JsType(prototype = "HTMLElement", isNative = true)
public interface PaperButton extends PaperFocusable {

  /**
   * The label of the button.
   *
   * @attribute label
   * @type string
   * @default ''
   */
  @JsProperty PaperButton label(String val);
  @JsProperty String label();

  /**
   * If true, the button will be styled as a "raised" button.
   *
   * @attribute raisedButton
   * @type boolean
   * @default false
   */
  @JsProperty PaperButton raisedButton(boolean val);
  @JsProperty boolean raisedButton();

  /**
   * (optional) The URL of an image for an icon to use in the button.
   * Should not use `icon` property if you are using this property.
   *
   * @attribute iconSrc
   * @type string
   * @default ''
   */
  @JsProperty PaperButton iconSrc(String val);
  @JsProperty String iconSrc();

  /**
   * (optional) Specifies the icon name or index in the set of icons
   * available in the icon set. If using this property, load the icon
   * set separately where the icon is used. Should not use `src`
   * if you are using this property.
   *
   * @attribute icon
   * @type string
   * @default ''
   */
  @JsProperty PaperButton icon(String val);
  @JsProperty String icon();
}
