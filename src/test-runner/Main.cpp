/*
 * Copyright (c) 2010-2014 Célio Cidral Junior.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

#include <QtTest>

#include "PomodoroEngineTest.h"
#include "TimerTest.h"
#include "TrayControllerTest.h"

int main(int argc, char** argv)
{
  tmty::PomodoroEngineTest pomodoroEngineTest;
  tmty::TimerTest timerTest;
  tmty::ui::TrayControllerTest trayControllerTest;

  return QTest::qExec(&timerTest, argc, argv)
       | QTest::qExec(&pomodoroEngineTest, argc, argv)
       | QTest::qExec(&trayControllerTest, argc, argv);
}
