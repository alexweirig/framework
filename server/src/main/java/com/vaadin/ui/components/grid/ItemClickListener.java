/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.ui.components.grid;

import com.vaadin.event.SerializableEventListener;
import com.vaadin.shared.Registration;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.ItemClick;

/**
 * A listener for item click events.
 *
 * @author Vaadin Ltd
 * @since 8.0
 *
 * @param <T>
 *            the grid bean type
 *
 * @see ItemClick
 * @see Registration
 */
@FunctionalInterface
public interface ItemClickListener<T> extends SerializableEventListener {
    /**
     * Invoked when this listener receives a item click event from a Grid to
     * which it has been added.
     *
     * @param event
     *            the received event, not null
     */
    public void itemClick(Grid.ItemClick<T> event);
}