/*
 * Copyright 2014 Benoît Prioux
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.binout.asciidoctor;

import org.asciidoctor.Asciidoctor;
import org.asciidoctor.Options;
import org.asciidoctor.OptionsBuilder;

public class Example {

    /**
     * This class has the following features:
     *
     * - Support for *foo*
     * - Support for _bar_
     *
     * [source, java]
     * ----
     * public class Jug {
     *    private String name;
     * }
     * ----
     *
     */
    public static void main(String[] args) {
        Asciidoctor asciidoctor = Asciidoctor.Factory.create();

        Options options = OptionsBuilder.options().backend("html5").get();
        String rendered = asciidoctor.convert("*Gras* ou _italique_ ?", options);

        System.out.println(rendered);
    }
}
