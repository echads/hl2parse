/**
 * Copyright (C) 2011 Darien Hager
 *
 * This code is part of the "HL2Parse" project, and is licensed under
 * a Creative Commons Attribution-ShareAlike 3.0 Unported License. For
 * either a summary of conditions or the full legal text, please visit:
 *
 * http://creativecommons.org/licenses/by-sa/3.0/
 *
 * Permissions beyond the scope of this license may be available
 * at http://technofovea.com/ .
 */
package com.technofovea.hl2parse.dmx;

import org.codehaus.preon.annotation.BoundList;
import org.codehaus.preon.annotation.BoundNumber;

/**
 *
 * @author Darien Hager
 */
public class AttrList {

    protected DmxElement owner;

    @BoundNumber(size="32")
    protected int count = 0;

    @BoundList(size="count")
    protected DmxAttribute[] items = new DmxAttribute[0];

}