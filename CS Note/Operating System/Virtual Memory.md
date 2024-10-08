가상 메모리
 - CPU 내부의 저장공간[register]은 용량이 작다
 - 물리 주소와 논리 주소
   - CPU와 프로세스는 메모리의 하드웨어 상 실제 주소인 [physical address]가 아닌 다른 주소 체계를 이용 : [logical address]
   - [logical address] : 프로세스마다 부여되는 0번지부터 시작하는 주소 체계
   - [논리 주소]에서는 중복되는 물리 주소의 번지 수는 존재하지 않는다
   - 중복되는 [논리 주소]의 번지 수는 존재 가능
   - 실제 정보가 저장되어 있는 하드웨어 상의 메모리와 상호작용하기 : 논리 주소와 물리 주소간의 변환 필요
   - CPU는 논리주소로 대화
   - [MMU] : CPU와 메모리 사이에 위치, CPU가 이해하는 논리 주소를 메모리가 이해하는 물리 주소로 변환한다 [Memory Management Unit]
 - 스와핑과 연속 메모리 할당
   - [swapping] : 가장 기본적인 메모리 할당 방식, 메모리 상의 빈 공간에 다른 프로세스를 적재하여 실행하는 메모리 관리 방식
   - [swap space] : 보조기억장치의 일부인 영역, I/O발생 등의 이유로 대기상태 or 사용되지 않은 프로세스 들이 보내지는 영역
   - [swap-out] : 현재 실행되지 않는 프로세스가 메모리에서 스왑 영역으로 옮겨지는 것
   - [swap-in] : 스왑 영역에 있는 프로세스가 메모리로 옮겨오는 것
   - 스왑 아웃 되었던 프로세스가 다시 스왑 인될 때는 스왑 아웃되기 전의 물리 주소와는 다른 주소에 적재될 수 있다
   - 프로세스에 연속적인 메모리 공간을 할당하는 방식
   - 메모리를 효율적으로 사용하는 방법은 아니다 : [외부 단편화]라는 문제를 내포
   - 연속 메모리 할당 환경에서는 프로세스의 실행과 종료를 반복하며 빈 공간에 프로세스를 할당
   - [외부 단편화] : 프로세스 바땉에 생기는 빈 공간들은 존재하나 그보다 큰 프로세스를 적재하기 어려운 상황 [external fragmentation]
   - 물리 메모리보다 큰 프로세스를 실행할 수 없다는 문제도 내포한다
 - 페이징을 통한 가상 메모리 관리
   - 외부 단편화와 물리 메모리보다 큰 프로세스 실행 불가인 2가지 문제점을 해결하기 위한 기술 : [가상 메모리]
   - [virtual memory] : 실행하고자 하는 프로그램의 일부만 메모리에 적재, 실제 메모리보다 큰 프로세스 실행 가능
                        보조기억장치의 일부를 메모리처럼 사용 or 프로세스의 일부만 메모리에 적재
                        가상 메모리 기법으로 생성된 논리 주소 공간 : 가상 주소 공간 [virtual address space]
   - 대표적인 가상 메모리 관리 기법 : [페이징], [세그멘테이션]
   - [paging] : 프로세스의 논리 주소 공간을 [page]라는 일정 단위로 나눈다
                물리 주소 공간을 [page]와 동일한 크기의 [frame]이라는 일정한 단위로 나눈 뒤
                [페이지를 프레임에 할당]하는 가상 메모리 관리 기법 
                프로세스를 구성하는 페이지는 물리 메모리 내에 불연속적으로 배치될 수 있다 : CPU 입장에서는 다음으로 실행할 페이지 위치 난해
                프로세스 전체가 스왑 아웃/스왑 인되는것이 아닌 페이지 단위로 스왑 아웃/스왑 인된다
                [page out], [page in]
   - [segmentation] : 프로세스를 일정한 크기의 [page]단위가 아닌 가변적인 크기의 [segment]단위로 분할하는 방식
                      세그먼트의 크기가 일정하지 않기 때문에 외부 단편화 발생할 수 있다
   - [page table] : 페이징 기법으로 불연속적 배치로 인한 CPU의 다음 주소찾기 난해 문제 해결을 위한 방법
                    프로세스의 페이지와 실제로 적재된 프레임을 짝지어주는 정보
                    페이지 번호와 실제로 적재된 프레임 번호가 대응되어 있다
                    프로세스마다 각자의 페이지 테이블 정보를 갖고 있다
                    CPU가 서로 다른 프로세스를 실행할 때, 각 프로세스의 페이지 테이블을 참조하여 메모리에 접근
   - [PTE] : [page Table Entry] : 페이지 테이블을 구송하고 있는 각각의 행들
                                  페이지 번호, 프레임 번호, 유효 비트, 보호 비트, 참조 비트, 수정 비트 등이 포함된다
   - [valid bit] : 해당 페이지에 접근 가능한지 여부를 알려주는 정보 [유효 비트]
                   현재 페이지가 메모리 or 보조기억장치에 적재되어 있는지 알려주는 비트 (O : 1 / X : 0)
   - CPU는 보조기억장치에 저장된 페이지에 직접 접근 불가 : 보조기억장치 속 페이지를 메모리로 적재 > 접근
   - 유효 비트가 0인 페이지에 접근하려고 한다 > [page fault]라는 예외 발생
   - [page fault]처리 과정 : 기존 작업 내용 백업 > 페이지 폴트 처리 루틴 실행 (원하는 페이지를 메모리에 옮겨 유효 비트를 1로 변경)
                           > 메모리에 적재된 페이지를 실행
   - [protection bit] : 페이지 보호 기능을 위한 비트, 접근 권한을 제한하여 페이지 보호 [Read : r/Write : w/eXecute : x > O : 111]
   - [reference bit] : CPU가 해당 페이지에 접근한 적이 있는지의 여부를 나타내는 비트
                       이력 존재 : 1 / 첫 방문 : 0
   - [modified bit] : 해당 페이지에 데이터를 쓴 적이 있는지의 여부를 알려주는 비트 [dirty bit]
                      변경된 이력 존재 : 1 / 변경 이력 X : 0 (접근 이력 X or 읽기만 했던 페이지)
   - 페이징은 외부 단편화 문제 해결 / 내부 단편화 문제 발생 가능 : 모든 프로세스가 페이지 크기에 딱 맞게 잘리는건 아니다
   - [내부 단편화] : 페이지 하나의 크기보다 작은 크기로 발생하게 되는 메모리 낭비
                   페이지 10KB, 프로세스의 크기 107KB일 경우 마지막 페이지는 3KB만큼 남는 현상
   - [PTBR] : [Page Table Base Register] : 프로세스를 실행하려면 프로세스의 페이지 테이블이 메모리에 적재된 위치 필요
                                           특정 프로세스의 페이지 테이블이 적재된 메모리 상의 위치를 가리키는 레지스터
                                           PTBR은 프로세스마다 가지는 정보 : 각 PCB에 기록 : 다른 프로세스로의 문맥 교환 발생시 변경
   - 페이지 테이블이 메모리에 [적재될 수 있다]
     - 메모리 접근 횟수
       - 모든 프로세스의 페이지 테이블이 메모리에 적재되어 있을 경우
       > CPU는 페이지 테이블에 접근하기 위해 한 번, 실제 프레임에 접근하기 위해 한 번 : 총 2번 메모리에 접근
       - 메모리에 접근하는 시간이 2배로 늘어날 수 있다
       - 해결하기 위해 [TLB]라는 페이지 테이블의 캐시 메모리 사용
       - [TLB] : [Translation Look-aside Buffer] : 참조 지역성의 원리에 근거 한다
                                                     > 자주 사용 페이지 위주로 페이지 테이블의 일부 내용을 저장
     - 메모리 용량
       - 프로세스의 크기가 커지면 페이지 테이블의 크기도 커진다
       - 모든 페이지 테이블 엔트리들을 메모리에 두는 것 : 메모리 낭비
       - Outer 페이지 테이블을 두어 잘린 페이지 테이블의 페이지를 가리키게 한다 : 페이디 테이블 전체가 메모리에 적재되는 문제 해결
     - 페이징 주소 체계
       - 하나의 페이지 내에는 여러 주소가 포함되어 있다
       - 기본적으로 <페이지 번호, 변위>와 같은 형태로 이루어져 있다
       - [page number] : 몇 번째 페이지에 접근할지를 나타낸다
       - [offset] : 접근하려는 주소가 페이지(프레임) 시작 번지로부터 얼마나 떨어져 있는지 나타내는 정보
       - <page number, offset>으로 이루어진 논리 주소 - [페이지 테이블] -> <frame number, offset> 형태의 물리 주소 (변환 과정)
 - 페이지 교체 알고리즘
   - [demand paging] : 메모리에 필요한 페이지만을 적재하는 기법
     - CPU가 특정 페이지에 접근하는 명령어를 실행
     - 유효 비트 1일 경우 : CPU는 페이지가 적재된 프레임에 접근
     - 유효 비트 0일 경우 : 페이지 폴트 발생
       - 페이지 폴트 루틴을 통해 해당 페이지를 메모리에 적재 > 유효 비트를 1로 설정
     - CPU가 특정 페이지에 접근하는 명령어를 실행
   - [pure demand paging] : 어떤 페이지도 메모리에 적재하지 않은 채 프로세스 실행
     - 첫 실행부터 페이지 폴트 발생 > 실행에 필요한 페이지가 어느정도 적재된 이후 페이지 폴트 발생 빈도 하락
     - 메모리가 가득 차는 상황 발생 > 추가적으로 페이지 적재 필요한 상황 > 페이지 스왑 아웃 필요
       - 적재된 페이지 중 보조기억장치로 보낼 페이지를 선택하는 방법 : [page replacement algorithm]
       - [thrashing] : 프로세스가 실제로 실행되는 시간보다 페이징에 더 많은 시간을 소요하여 성능이 저하되는 문제
   - [FIFO 페이지 교체 알고리즘] : 먼저 적재된 페이지부터 스왑 아웃 하는 알고리즘
     - 지속적으로 참조되는 페이지를 스왑 아웃할 가능성 존재 > 페이지 폴트 발생
   - [최적 페이지 교체 알고리즘] : 사용 빈도가 낮은 페이지를 교체하는 알고리즘
     - 가장 낮은 페이지 폴트율 / 사용 빈도 낮음 정도를 미리 예측하기 어렵다 = 실제 구현 난해
   - [LRU 페이지 교체 알고리즘] : 가장 적게 '사용한' 페이지를 교체하는 알고리즘
     - 보편적으로 사용되는 알고리즘
                      