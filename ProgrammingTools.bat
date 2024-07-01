@echo off
title SEVEN IT DEPARTMENT PROGRAMMING TOOLS SETUP
echo ***********************************************
echo * SEVEN IT DEPARTMENT PROGRAMMING TOOLS SETUP *
echo ***********************************************
echo.
timeout /t 10 /nobreak
cls
winget install JetBrains.IntelliJIDEA.Community
winget install JetBrains.PyCharm.Community
winget install Codeblocks.Codeblocks
winget install SQLite.SQLite
winget install sqlitestudio.pl.SQLiteStudio
winget install Git.Git
winget install GitHub.GitHubDesktop
winget install OpenJS.NodeJS.LTS


cls
echo COMPLETED!
pause