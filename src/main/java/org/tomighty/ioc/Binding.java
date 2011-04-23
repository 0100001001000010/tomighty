/*
 * Copyright (c) 2010-2011 Célio Cidral Junior
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.tomighty.ioc;

public class Binding<T> {
	
	@Inject private Factory factory;
	private T instance;
	private Class<? extends T> concreteClass;

	public void to(T instance) {
		this.instance = instance;
	}
	
	public void to(Class<? extends T> concreteClass) {
		this.concreteClass = concreteClass;
		
	}

	public T instance(Object needer) {
		if(instance != null) {
			return instance;
		}
		if(concreteClass == null) {
			throw new IllegalStateException("Neither an instance nor a concrete class were provided");
		}
		return factory.create(concreteClass, needer);
	}

}
