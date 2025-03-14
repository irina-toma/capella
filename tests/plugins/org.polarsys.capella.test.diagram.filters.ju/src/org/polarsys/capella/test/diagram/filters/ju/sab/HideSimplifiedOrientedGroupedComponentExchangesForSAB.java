/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.filters.ju.sab;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;
import org.polarsys.capella.test.diagram.filters.ju.DefaultActivatedFilterTestCase;

public class HideSimplifiedOrientedGroupedComponentExchangesForSAB extends DefaultActivatedFilterTestCase {

  private final String SYSTEM_ID = "767f43af-8824-41cc-bdfa-9a418c9cea3b";

  @Override
  protected String getTestProjectName() {
    return "StandardDiagramFiltersModel";
  }

  @Override
  protected String getDiagramName() {
    return "[SAB] System";
  }

  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_SAB_HIDE_SIMPLIFIED_ORIENTED_GROUPED_COMPONENT_EXCHANGES;
  }

  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays.asList(new String[] { SYSTEM_ID });
  }

}
