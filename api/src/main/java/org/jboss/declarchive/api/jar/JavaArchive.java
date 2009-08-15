/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.declarchive.api.jar;

import org.jboss.declarchive.api.Archive;
import org.jboss.declarchive.api.container.ClassContainer;
import org.jboss.declarchive.api.container.ManifestContainer;
import org.jboss.declarchive.api.container.ResourceContainer;

/**
 * JavaArchive
 * 
 * Traditional JAR (Java Archive) structure.  Used in 
 * construction of libraries and applications.
 *
 * @see http://java.sun.com/j2se/1.5.0/docs/guide/jar/jar.html
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a> 
 * @version $Revision: $
 */
public interface JavaArchive extends Archive<JavaArchive>, 
      ResourceContainer<JavaArchive>, ManifestContainer<JavaArchive>, ClassContainer<JavaArchive>
{

}