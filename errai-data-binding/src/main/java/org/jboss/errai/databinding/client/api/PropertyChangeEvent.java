/*
 * Copyright 2012 JBoss, a division of Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.errai.databinding.client.api;

/**
 * Dispatched when a bound property has changed.
 * 
 * @author David Cracauer <dcracauer@gmail.com>
 */
public class PropertyChangeEvent {
  private final String propertyName;
  private final Object oldValue;
  private final Object newValue;

  public PropertyChangeEvent(String propertyName, Object oldValue, Object newValue) {
    this.propertyName = propertyName;
    this.oldValue = oldValue;
    this.newValue = newValue;
  }

  /**
   * Gets the new value of the property.
   * 
   * @return new property value.
   */
  public Object getNewValue() {
    return newValue;
  }

  /**
   * Gets the old value of the property.
   * 
   * @return old property value.
   */
  public Object getOldValue() {
    return oldValue;
  }

  /**
   * Gets the property name.
   * 
   * @return the property name.
   */
  public String getPropertyName() {
    return propertyName;
  }

}