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

import org.jboss.declarchive.api.JavaArchiveFactory;
import org.jboss.declarchive.api.spec.JavaArchive;
import org.jboss.declarchive.impl.base.spec.JavaArchiveImpl;
import org.jboss.declarchive.spi.MemoryMapArchive;

/**
 * JavaArchiveFactoryImpl
 * 
 * JavaArchiveFactory implementation used to create {@link JavaArchive} instances. Thread-safe.
 *
 * @author <a href="mailto:baileyje@gmail.com">John Bailey</a>
 * @version $Revision: $
 */
public class JavaArchiveFactoryImpl extends JavaArchiveFactory
{

   /*
    * {@inheritDoc}
    * @see org.jboss.declarchive.api.JavaArchiveFactory#doCreate(java.lang.String)
    */
   @Override
   protected JavaArchive doCreate(String archiveName)
   {
      // Create storage delegate
      MemoryMapArchive memoryMapArchive = new MemoryMapArchiveImpl(archiveName);

      // Create Java Archive
      JavaArchive javaArchive = new JavaArchiveImpl(memoryMapArchive);

      // Return archive
      return javaArchive;
   }

}
