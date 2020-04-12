# Drools
*This Repository contains Drool Related Projects*

[Documentation link ](https://docs.jboss.org/drools/release/7.35.0.Final/drools-docs/html_single/index.html#decision-engine-con_decision-engine)

## Introduction
Drools is a business-rule management system with a forward-chaining and backward-chaining inference-based rules engine, 
allowing fast and reliable evaluation of business rules and complex event processing. A rules engine is also a fundamental 
building block to create an expert system which, in artificial intelligence, is a computer system that emulates the decision-making 
ability of a human expert.

## Drools engine
The Drools engine is the rules engine in Drools. The Drools engine stores, processes, and evaluates data to execute the business rules or 
decision models that you define. The basic function of the Drools engine is to match incoming data, or facts, to the conditions of rules and 
determine whether and how to execute the rules.

It Operates using following basic components:
1.Rules: Business rules or DMN decisions that you define. All rules must contain at a minimum the conditions that trigger 
the rule and the actions that the rule dictates.
2.Facts: Data that enters or changes in the Drools engine that the Drools engine matches to rule conditions to execute applicable rules.
3.Production memory: Location where rules are stored in the Drools engine. - Any input/output is a RULE.
4.Working memory: Location where facts are stored in the Drools engine. - Any input/output is a FACT.
5.Agenda: Location where activated rules are registered and sorted (if applicable) in preparation for execution.

Decision Authoring Asset - Language/syntax/tool that you can use to "define" or "state" business decisions in your drool service is called a 
**Decision Authoring Asset**. Drool provides several such assets, for eg - DMN (Decision Model and Annotation), Guided Decision Tables, 
SpreadSheet Decision Tables, Guided Rules, Guided Rule Templates, DRL Rules, Predictive Model Markup Language (PMML).
1. DRL Rules - Have rules in .drl files, is optimal for creating rules that require advance DRL options.
1. PMML Models - Are optimal for incorporating predictive data into decision services.

**No need to create a Drool Project with KJar packaging, You can embed drools into your microservice as well.**
- Our application should be sufficient and capable enough to validate and execute drools rules as our Business Rules.
- Executing drools files is also known as executing assets.

![Drools Flow](/Drools_Embedded.png)

Drools with an IDE and an embedded Java application:
- Drools libraries embedded within a custom application such as a Microservice.
- External Git repository for project versioning (not synchronized with Business Central) and 
external Maven repository for project management and building configured with your 
embedded Java application (not configured with KIE Server)
- Asset Type - Drools Rule Language (DRL) rules
- Use of custom APIs to interact with core KIE APIs to execute assets in the embedded engine.

## Building a KIE Project
A KIE project or module is simply a Maven Java project or module; with an additional metadata file META-INF/kmodule.xml. 
The kmodule.xml file is the descriptor that selects resources to KIE bases and configures those KIE bases and sessions.
A KieModule is a KIE project, if you want to use as a Jar in your application/microservice.
classpath KieModule and dynamic KieModule are used to refer to the two loading approaches.

- You can have empty kmodule.xml - it’s used for discovery of the JAR and its contents.
- use 'mvn install' to deploy a KieModule to the local machine
 or  'mvn deploy' to push the KieModule to a remote Maven repository and Building the Application will pull in the KieModule 
and populate the local Maven repository in the process.
- Use kie-maven-plugin to get build time validation

### KIE Base
- KieBase is a repository for all application's knowledge. It does NOT contain data but rather rules, processes and other things to 
process data and yield result. Sessions are created for KieBase into which data is inserted.
KieBase is heavy, KieContainer takes care of caching required.

### KIE Session
- KieSession stores and executes on the runtime data
- KieSession is created from KieBase and can be directly created from KieContainer as well.
- It can be stateful or stateless.

### Do you need KieFileSystem?
KieFileSystem, a sort of virtual file system can be used to define the KieBases and KieSessions belonging to a KieModule programmatically.
- The KieScanner allows continuous monitoring of your Maven repository to check whether a new release of a Kie project has been installed
- set path to settings.xml in property kie.maven.settings.custom

##### Appendix
POJOs are known as Facts
DRL files are known as Rules

