/*
 * JBoss, Home of Professional Open Source
 * Copyright ${year}, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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

package org.richfaces.component.html;

import org.richfaces.component.UITogglePanelTitledItem;
import javax.faces.component.behavior.ClientBehaviorHolder;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author akolonitsky
 * @since 2010-08-27
 */
public class HtmlTab extends UITogglePanelTitledItem implements ClientBehaviorHolder {

    public static final String COMPONENT_TYPE = "org.richfaces.TogglePanelTitledItem";

    public static final String COMPONENT_FAMILY = "org.richfaces.TogglePanelTitledItem";

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList(
        "headerclick",
        "headerdblclick",
        "headermousedown",
        "headermousemove",
        "headermouseup",
        "enter",
        "leave",
        "click",
        "dblclick",
        "mousedown",
        "mousemove",
        "mouseout",
        "mouseover",
        "mouseup"
    ));


    public enum PropertyKeys {
        headerClassActive,
        headerClassDisabled,
        headerClassInactive,
        headerClass,
        headerStyle,
        contentClass,
        onheaderclick,
        onheaderdblclick,
        onheadermousedown,
        onheadermousemove,
        onheadermouseup,
        onenter,
        onleave,
        lang,
        title,
        style,
        styleClass,
        dir,
        onclick,
        ondblclick,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup
    }

    public HtmlTab() {
        setRendererType("org.richfaces.Tab");
    }

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public String getHeaderClassActive() {
        return (String) getStateHelper().eval(PropertyKeys.headerClassActive);
    }

    public void setHeaderClassActive(String headerClassActive) {
        getStateHelper().put(PropertyKeys.headerClassActive, headerClassActive);
    }

    public String getHeaderClassDisabled() {
        return (String) getStateHelper().eval(PropertyKeys.headerClassDisabled);
    }

    public void setHeaderClassDisabled(String headerClassDisabled) {
        getStateHelper().put(PropertyKeys.headerClassDisabled, headerClassDisabled);
    }

    public String getHeaderClassInactive() {
        return (String) getStateHelper().eval(PropertyKeys.headerClassInactive);
    }

    public void setHeaderClassInactive(String headerClassInactive) {
        getStateHelper().put(PropertyKeys.headerClassInactive, headerClassInactive);
    }

    public String getHeaderClass() {
        return (String) getStateHelper().eval(PropertyKeys.headerClass);
    }

    public void setHeaderClass(String headerClass) {
        getStateHelper().put(PropertyKeys.headerClass, headerClass);
    }

    public String getHeaderStyle() {
        return (String) getStateHelper().eval(PropertyKeys.headerStyle);
    }

    public void setHeaderStyle(String headerStyle) {
        getStateHelper().put(PropertyKeys.headerStyle, headerStyle);
    }

    public String getContentClass() {
        return (String) getStateHelper().eval(PropertyKeys.contentClass);
    }

    public void setContentClass(String contentClass) {
        getStateHelper().put(PropertyKeys.contentClass, contentClass);
    }

    public String getOnheaderclick() {
        return (String) getStateHelper().eval(PropertyKeys.onheaderclick);
    }

    public void setOnheaderclick(String onheaderclick) {
        getStateHelper().put(PropertyKeys.onheaderclick, onheaderclick);
    }

    public String getOnheaderdblclick() {
        return (String) getStateHelper().eval(PropertyKeys.onheaderdblclick);
    }

    public void setOnheaderdblclick(String onheaderdblclick) {
        getStateHelper().put(PropertyKeys.onheaderdblclick, onheaderdblclick);
    }

    public String getOnheadermousedown() {
        return (String) getStateHelper().eval(PropertyKeys.onheadermousedown);
    }

    public void setOnheadermousedown(String onheadermousedown) {
        getStateHelper().put(PropertyKeys.onheadermousedown, onheadermousedown);
    }

    public String getOnheadermousemove() {
        return (String) getStateHelper().eval(PropertyKeys.onheadermousemove);
    }

    public void setOnheadermousemove(String onheadermousemove) {
        getStateHelper().put(PropertyKeys.onheadermousemove, onheadermousemove);
    }

    public String getOnheadermouseup() {
        return (String) getStateHelper().eval(PropertyKeys.onheadermouseup);
    }

    public void setOnheadermouseup(String onheadermouseup) {
        getStateHelper().put(PropertyKeys.onheadermouseup, onheadermouseup);
    }

    public String getOnenter() {
        return (String) getStateHelper().eval(PropertyKeys.onenter);
    }

    public void setOnenter(String onenter) {
        getStateHelper().put(PropertyKeys.onenter, onenter);
    }

    public String getOnleave() {
        return (String) getStateHelper().eval(PropertyKeys.onleave);
    }

    public void setOnleave(String onleave) {
        getStateHelper().put(PropertyKeys.onleave, onleave);
    }

    public String getLang() {
        return (String) getStateHelper().eval(PropertyKeys.lang);
    }

    public void setLang(String lang) {
        getStateHelper().put(PropertyKeys.lang, lang);
    }

    public String getTitle() {
        return (String) getStateHelper().eval(PropertyKeys.title);
    }

    public void setTitle(String title) {
        getStateHelper().put(PropertyKeys.title, title);
    }

    public String getStyle() {
        return (String) getStateHelper().eval(PropertyKeys.style);
    }

    public void setStyle(String style) {
        getStateHelper().put(PropertyKeys.style, style);
    }

    public String getStyleClass() {
        return (String) getStateHelper().eval(PropertyKeys.styleClass);
    }

    public void setStyleClass(String styleClass) {
        getStateHelper().put(PropertyKeys.styleClass, styleClass);
    }

    public String getDir() {
        return (String) getStateHelper().eval(PropertyKeys.dir);
    }

    public void setDir(String dir) {
        getStateHelper().put(PropertyKeys.dir, dir);
    }

    public String getOnclick() {
        return (String) getStateHelper().eval(PropertyKeys.onclick);
    }

    public void setOnclick(String onclick) {
        getStateHelper().put(PropertyKeys.onclick, onclick);
    }

    public String getOndblclick() {
        return (String) getStateHelper().eval(PropertyKeys.ondblclick);
    }

    public void setOndblclick(String ondblclick) {
        getStateHelper().put(PropertyKeys.ondblclick, ondblclick);
    }

    public String getOnmousedown() {
        return (String) getStateHelper().eval(PropertyKeys.onmousedown);
    }

    public void setOnmousedown(String onmousedown) {
        getStateHelper().put(PropertyKeys.onmousedown, onmousedown);
    }

    public String getOnmousemove() {
        return (String) getStateHelper().eval(PropertyKeys.onmousemove);
    }

    public void setOnmousemove(String onmousemove) {
        getStateHelper().put(PropertyKeys.onmousemove, onmousemove);
    }

    public String getOnmouseout() {
        return (String) getStateHelper().eval(PropertyKeys.onmouseout);
    }

    public void setOnmouseout(String onmouseout) {
        getStateHelper().put(PropertyKeys.onmouseout, onmouseout);
    }

    public String getOnmouseover() {
        return (String) getStateHelper().eval(PropertyKeys.onmouseover);
    }

    public void setOnmouseover(String onmouseover) {
        getStateHelper().put(PropertyKeys.onmouseover, onmouseover);
    }

    public String getOnmouseup() {
        return (String) getStateHelper().eval(PropertyKeys.onmouseup);
    }

    public void setOnmouseup(String onmouseup) {
        getStateHelper().put(PropertyKeys.onmouseup, onmouseup);
    }



    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }
}

