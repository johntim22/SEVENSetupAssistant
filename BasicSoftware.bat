powershell -command "set-executionpolicy AllSigned"
powershell -command "get-executionpolicy"
powershell -command "Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))"
@echo off
pause
cls
title SEVEN CHC NEW PC WIZARD
echo ----------------------------------------------
echo     WELCOME TO SEVEN CHC NEW PC WIZARD       
echo ----------------------------------------------
echo This wizard will now install some basic software required for your computer.
timeout /t 10 /nobreak
cls
winget install GNU.Wget2
winget install Brave.Brave
winget install SoftDeluxe.FreeDownloadManager
winget install Microsoft.WindowsPCHealthCheck
winget install Microsoft.PCManager
winget install Microsoft.UpdateAssistant
winget install WestWind.MarkdownMonster
winget install Obsidian.Obsidian
winget install XP89DCGQ3K6VLD

cls
echo All actions have been completed! Enjoy your new computer!
pause