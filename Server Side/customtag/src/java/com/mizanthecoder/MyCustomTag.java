/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizanthecoder;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author mohdm
 */
public class MyCustomTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        try {
// Task... Tag that call here. 
            JspWriter out = pageContext.getOut();
            out.println("mizan404");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

}
