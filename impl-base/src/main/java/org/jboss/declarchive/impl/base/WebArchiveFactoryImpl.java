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
package org.jboss.declarchive.impl.base;

import org.jboss.declarchive.api.WebArchiveFactory;
import org.jboss.declarchive.api.spec.WebArchive;
import org.jboss.declarchive.impl.base.spec.WebArchiveImpl;
import org.jboss.declarchive.spi.MemoryMapArchive;

/**
 * WebArchiveFactoryImpl
 * 
 * WebArchiveFactory implementation used to create {@link WebArchive} instances. Thread-safe.
 *
 * @author <a href="mailto:baileyje@gmail.com">John Bailey</a>
 * @version $Revision: $
 */
public class WebArchiveFactoryImpl extends WebArchiveFactory
{

   /*
    * {@inheritDoc}
    * @see org.jboss.declarchive.api.WebArchiveFactory#doCreate(java.lang.String)
    */
   @Override
   protected WebArchive doCreate(String archiveName)
   {
      // Create storage delegate
      MemoryMapArchive memoryMapArchive = new MemoryMapArchiveImpl(archiveName);

      // Create web archive
      WebArchive webArchive = new WebArchiveImpl(memoryMapArchive);

      // Return archive
      return webArchive;
   }

}
