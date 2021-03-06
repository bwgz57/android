/*
 * Copyright (C) 2013 bwgz.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as 
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bwgz.android.environment.sherlock;

import java.util.List;

import org.bwgz.android.common.TwoLineItem;
import org.bwgz.android.common.sherlock.TwoLineListActivity;
import org.bwgz.android.environment.OperatingSystemTwoLineList;

import android.os.Bundle;

public class OperatingSystemActivity extends TwoLineListActivity {
	private OperatingSystemTwoLineList list;

	@Override
	public List<TwoLineItem> getList() {
		return list;
	}

	@Override
    public void onCreate(Bundle savedInstanceState) {
		list = new OperatingSystemTwoLineList();

		super.onCreate(savedInstanceState);
    }
}
