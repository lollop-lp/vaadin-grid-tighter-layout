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
public interface CoreSelector {

  /**
   * Gets or sets the selected element.  Default to use the index
   * of the item element.
   *
   * If you want a specific attribute value of the element to be
   * used instead of index, set "valueattr" to that attribute name.
   *
   * Example:
   *
   *     <core-selector valueattr="label" selected="foo">
   *       <div label="foo"></div>
   *       <div label="bar"></div>
   *       <div label="zot"></div>
   *     </core-selector>
   *
   * In multi-selection this should be an array of values.
   *
   * Example:
   *
   *     <core-selector id="selector" valueattr="label" multi>
   *       <div label="foo"></div>
   *       <div label="bar"></div>
   *       <div label="zot"></div>
   *     </core-selector>
   *
   *     this.$.selector.selected = ['foo', 'zot'];
   *
   * @attribute selected
   * @type Object
   * @default null
   */
  @JsProperty CoreSelector selected(JsObject val);
  @JsProperty JsObject selected();

  /**
   * If true, multiple selections are allowed.
   *
   * @attribute multi
   * @type boolean
   * @default false
   */
  @JsProperty CoreSelector multi(boolean val);
  @JsProperty boolean multi();

  /**
   * Specifies the attribute to be used for "selected" attribute.
   *
   * @attribute valueattr
   * @type string
   * @default 'name'
   */
  @JsProperty CoreSelector valueattr(String val);
  @JsProperty String valueattr();

  /**
   * Specifies the CSS class to be used to add to the selected element.
   * 
   * @attribute selectedClass
   * @type string
   * @default 'core-selected'
   */
  @JsProperty CoreSelector selectedClass(String val);
  @JsProperty String selectedClass();

  /**
   * Specifies the property to be used to set on the selected element
   * to indicate its active state.
   *
   * @attribute selectedProperty
   * @type string
   * @default ''
   */
  @JsProperty CoreSelector selectedProperty(String val);
  @JsProperty String selectedProperty();

  /**
   * Specifies the attribute to set on the selected element to indicate
   * its active state.
   *
   * @attribute selectedAttribute
   * @type string
   * @default 'active'
   */
  @JsProperty CoreSelector selectedAttribute(String val);
  @JsProperty String selectedAttribute();

  /**
   * Returns the currently selected element. In multi-selection this returns
   * an array of selected elements.
   * 
   * @attribute selectedItem
   * @type Object
   * @default null
   */
  @JsProperty CoreSelector selectedItem(JsObject val);
  @JsProperty JsObject selectedItem();

  /**
   * In single selection, this returns the model associated with the
   * selected element.
   * 
   * @attribute selectedModel
   * @type Object
   * @default null
   */
  @JsProperty CoreSelector selectedModel(JsObject val);
  @JsProperty JsObject selectedModel();

  /**
   * In single selection, this returns the selected index.
   *
   * @attribute selectedIndex
   * @type number
   * @default -1
   */
  @JsProperty CoreSelector selectedIndex(double val);
  @JsProperty double selectedIndex();

  /**
   * The target element that contains items.  If this is not set 
   * core-selector is the container.
   * 
   * @attribute target
   * @type Object
   * @default null
   */
  @JsProperty CoreSelector target(JsObject val);
  @JsProperty JsObject target();

  /**
   * This can be used to query nodes from the target node to be used for 
   * selection items.  Note this only works if the 'target' property is set.
   *
   * Example:
   *
   *     <core-selector target="{{$.myForm}}" itemsSelector="input[type=radio]"></core-selector>
   *     <form id="myForm">
   *       <label><input type="radio" name="color" value="red"> Red</label> <br>
   *       <label><input type="radio" name="color" value="green"> Green</label> <br>
   *       <label><input type="radio" name="color" value="blue"> Blue</label> <br>
   *       <p>color = {{color}}</p>
   *     </form>
   * 
   * @attribute itemSelector
   * @type string
   * @default ''
   */
  @JsProperty CoreSelector itemSelector(String val);
  @JsProperty String itemSelector();

  /**
   * The event that would be fired from the item element to indicate
   * it is being selected.
   *
   * @attribute activateEvent
   * @type string
   * @default 'tap'
   */
  @JsProperty CoreSelector activateEvent(String val);
  @JsProperty String activateEvent();

  /**
   * Set this to true to disallow changing the selection via the
   * `activateEvent`.
   *
   * @attribute notap
   * @type boolean
   * @default false
   */
  @JsProperty CoreSelector notap(boolean val);
  @JsProperty boolean notap();
}
