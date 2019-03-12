This hotfix has been developed specifically for you and has not been
fully tested by Oracle. It is important that you thoroughly test this
in a staging environment before deploying it to your production
environment. It has been built against Oracle ATG 10.1.2

Summary of the problems handled by this hotfix:
==============================================
Bug 14287817 - [REGRESSION] PROHIBITING DUPLICATES MECHANISM IS BROKEN FOR COLLECTION EDITORS 

This hotfix includes the following contents:

jar -xvf p14287817_1012_v1_lib.jar
  created: atg/
  created: atg/remote/
  created: atg/remote/assetmanager/
  created: atg/remote/assetmanager/editor/
  created: atg/remote/assetmanager/editor/service/
 inflated: atg/remote/assetmanager/editor/service/RepositoryAsssetPropertyServiceImpl.class
 inflated: atg/remote/assetmanager/editor/service/RepositoryAssetPropertyServiceImpl$StringIdComparator.class

Installation steps
===========================

I. Hotfix classes
    (1) Create a hotfix directory and place p14287817_1012_v1_lib.jar into it
        (e.g., <Temp>/hotfix/p14287817_1012_v1_lib.jar).
    (2) Recreate and redeploy the ATG EAR file. Use the -prependJars switch with the
        runAssembler command.           
        e.g., runAssembler -prependJars <Temp>/hotfix/p14287817_1012_v1_lib.jar <EarFileName> -m <ListOfModules>
