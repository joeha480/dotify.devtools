[![Build Status](https://travis-ci.com/brailleapps/dotify.devtools.svg?branch=master)](https://travis-ci.com/brailleapps/dotify.devtools)
[![Type](https://img.shields.io/badge/type-library_bundle-blue.svg)](https://github.com/brailleapps/wiki/wiki/Types)
[![License: LGPL v2.1](https://img.shields.io/badge/License-LGPL%20v2%2E1%20%28or%20later%29-blue.svg)](https://www.gnu.org/licenses/lgpl-2.1)

# dotify.devtools #

In addition to the Dotify project, there is a DotifyDevtools project in the code repository. DotifyDevtools contains tools that are useful when developing for Dotify, but are not needed when running the final software.

## Main Features ##
Tools included in devtools:
  * GenerateTableEntries
  * SchematronRulesGenerator
  * PefFileCompareUI
  * Unbrailler
  * and more

### GenerateTableEntries ###
This tool allows a user to generate braille table entries for a span of unicode characters that are to be added to a braille table. Currently, the parameters are embedded in the code, and need to be recompiled if modified.

### SchematronRulesGenerator ###
This tool can be used to build schematron files using a compact java notation.

### PefFileCompareUI ###
This tool can be used for regression testing. It allows detailed comparing between two folders of pef-files, ignoring meta data.

#### Environment variables ####
`org.daisy.dotify.devtools.regression.baseline` specifies whether the baseline should be updated or just used for comparison.

values: `update` or `compare` (default)

`org.daisy.dotify.devtools.regression.mode` specifies whether the Dotify CLI should be called with the `convert` command or not.

values: `convert` or `legacy` (default) 

`org.daisy.dotify.devtools.regression.dotify.arguments` specifies whether optional Dotify arguments are added last to the command line or on their legacy positions (5, 6 and 9+). 

values: `last`or `legacy` (default)

### Unbrailler ###
This tool can be used to compare text differences in an xml-editor. A folder is scanned for PEF-files and the braille in each file is replaced by ascii characters for easier debugging.

## Using ##
To use the bundle<strike>, download the [latest release](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.daisy.dotify%22%20AND%20a%3A%22dotify.devtools%22) from maven central</strike> install it in your local maven cache with:

`gradlew install` (Windows) or `./gradlew install` (Mac/Linux)


## Building ##
Build with `gradlew build` (Windows) or `./gradlew build` (Mac/Linux)

## Testing ##
Tests are run with `gradlew test` (Windows) or `./gradlew test` (Mac/Linux)

## Javadoc ##
Javadoc for the latest Dotify Devtools is available [here](http://brailleapps.github.io/dotify.devtools/latest/javadoc/).

## Requirements & Compatibility ##
- Requires Java 8

## More information ##
See the [common wiki](https://github.com/brailleapps/wiki/wiki) for more information.
