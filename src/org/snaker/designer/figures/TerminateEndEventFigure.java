/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.designer.figures;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * 中止结束事件图形
 * @author yuqs
 * @version 1.0
 */
public class TerminateEndEventFigure extends EventFigure {
	private static final Image icon = ImageDescriptor.createFromFile(
			TaskFigure.class, "icons/48/end_event_terminate.png").createImage();

	protected void customizeFigure() {
		setIcon(icon);
	}

}
