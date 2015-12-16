/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'yaro' at '15.12.15 15:12' with Gradle 2.8
 *
 * @author yaro, @date 15.12.15 15:12
 */
package org.bso.ifml


import spock.lang.Specification
import groovy.io.*;


class StoryScriptLoaderTest extends Specification{
  def "It can load from URL"() {

    given:
    def loader = new StoryScriptLoader()
    def storyUrl = this.class.classLoader.getResource("ruslan.groovy")

    when:
    def storyText = loader.load(storyUrl)

    then:
      storyText != null
      storyText.size() > 0
  }
}