@echo off
title SEVEN IT DEPARTMENT DATA ANALYTIS TOOLS SETUP
echo ***********************************************
echo * SEVEN IT DEPARTMENT DATA ANALYTICS TOOLS SETUP *
echo ***********************************************
echo.
timeout /t 10 /nobreak
cls
winget install Microsoft.PowerBI
winget install KNIMEAG.KNIMEAnalyticsPlatform
winget install Tableau.Public
winget install RProject.R
winget install Posit.RStudio
winget install GNU.Octave
winget install Scilab.Scilab

cls
echo COMPLETED!
pause