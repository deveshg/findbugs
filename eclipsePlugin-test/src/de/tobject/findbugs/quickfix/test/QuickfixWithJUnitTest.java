/*
 * Contributions to FindBugs
 * Copyright (C) 2009, Tom�s Pollak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package de.tobject.findbugs.quickfix.test;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

import de.tobject.findbugs.test.AbstractQuickfixTest;

/**
 * This class tests the quickfix resolutions for examples that use JUnit.
 * 
 * @author Tom�s Pollak
 */
public class QuickfixWithJUnitTest extends AbstractQuickfixTest {
	@Test
	public void testCreateSuperCallResolution() throws CoreException, IOException {
		doTestQuickfixResolution("CreateSuperCallResolutionExample.java",
				"FI_MISSING_SUPER_CALL", "IJU_SETUP_NO_SUPER", "IJU_TEARDOWN_NO_SUPER");
	}

	@Override
	protected void addExtraClassPathEntries() throws CoreException {
		super.addExtraClassPathEntries();
		addJUnitToProjectClasspath();
	}
}